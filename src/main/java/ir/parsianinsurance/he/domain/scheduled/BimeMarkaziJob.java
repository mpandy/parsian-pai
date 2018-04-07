package ir.parsianinsurance.he.domain.scheduled;


import ir.parsianinsurance.he.domain.model.Artifact;
import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;
import ir.parsianinsurance.he.infrastructure.logging.BimeMarkaziLog;
import ir.parsianinsurance.he.infrastructure.repository.ArtifactLogRepository;
import ir.parsianinsurance.he.infrastructure.repository.BimeMarkaziLogRepository;
import ir.parsianinsurance.he.infrastructure.service.IArtifactLogService;
import ir.parsianinsurance.he.infrastructure.service.IBimeMarkaziService;
import ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi.WbsV4PlcyRes;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class BimeMarkaziJob {

    @Inject
    IBimeMarkaziService bimeMarkaziService;

    @Inject
    ArtifactLogRepository artifactLogRepository;

    @Inject
    BimeMarkaziLogRepository bimeMarkaziLogRepository;

    @Inject
    IArtifactLogService artifactLogService;

//    @Schedule(hour="*", minute = "*/1", persistent = false)
    public void callBimeMarkaziService() {

        bimeMarkaziService.sabteAgency(null);

//        System.out.print("Try to call bimeMarkaziService on... ");
//        List<ArtifactLog> totalRecordToProcess = artifactLogRepository.findArtifactLogBySanamDoneIsTrueAndBimeMarkaziDoneIsFalse();
//        System.out.println(totalRecordToProcess.size()+" records");
//        totalRecordToProcess.forEach(x -> takeCareOf(x));
    }

    private void takeCareOf(ArtifactLog log) {

        Artifact artifact = artifactLogService.getArtifact(log);
        if(artifact instanceof Bimename)
        {
            Bimename bimename = (Bimename) artifact;
            WbsV4PlcyRes response = bimeMarkaziService.sodoorBimename(bimename);
            BimeMarkaziLog bimeMarkaziLog = new BimeMarkaziLog(response, bimename.getId());
            bimeMarkaziLogRepository.save(bimeMarkaziLog);

            if(bimeMarkaziLog.getStatus().equals("Success")) {
                log.setBimeMarkaziDone(true);
                artifactLogRepository.save(log);
            }
        }

        if(artifact instanceof Elhaghiye) {

        }

        if(artifact instanceof Khesarat) {

        }

    }

}
