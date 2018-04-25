package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;
import ir.parsianinsurance.he.infrastructure.repository.BimenameRepository;
import ir.parsianinsurance.he.infrastructure.repository.ElhaghiyeRepository;
import ir.parsianinsurance.he.infrastructure.repository.HavaleKhesaratRepository;
import ir.parsianinsurance.he.infrastructure.repository.KhesaratRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ArtifactLogService implements IArtifactLogService {

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    ElhaghiyeRepository elhaghiyeRepository;

    @Inject
    HavaleKhesaratRepository havaleKhesaratRepository;

    @Override
    public Artifact getArtifact(ArtifactLog log) {
        Artifact artifact = null;

        switch (log.getArtifactType())
        {
            case "Bimename":
                Long bimenameId = log.getArtifactId();
                Bimename bimename = bimenameRepository.findOne(bimenameId);
                if(bimename.getVaziateBimename().equals(VaziateBimename.DAEM))
                    artifact = bimename;
                break;

            case "Elhaghiye":
                Long elhaghiyeId = log.getArtifactId();
                Elhaghiye elhaghiye = elhaghiyeRepository.findOne(elhaghiyeId);
                if(     elhaghiye.getVaziateElhaghiye().equals(VaziateElhaghiye.TAGHIR_NAHAYI_SHODE) ||
                        elhaghiye.getVaziateElhaghiye().equals(VaziateElhaghiye.FASKH_NAHAYI_SHODE) ||
                        elhaghiye.getVaziateElhaghiye().equals(VaziateElhaghiye.EBTAL_NAHAYI_SHODE)
                        )
                    artifact = elhaghiye;
                break;

            case "HavaleKhesarat":
                    Long havaleKhesaratId = log.getArtifactId();
                    HavaleKhesarat havaleKhesarat = havaleKhesaratRepository.findOne(havaleKhesaratId);
                    artifact = havaleKhesarat;
                break;
        }

        return artifact;
    }
}
