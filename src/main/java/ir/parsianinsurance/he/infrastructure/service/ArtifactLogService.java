package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.*;
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
                if(log.getArtifactState().equals("DAEM"))
                {
                    Long bimenameId = log.getArtifactId();
                    Bimename bimename = bimenameRepository.findOne(bimenameId);
                    artifact = bimename;
                }
                break;

            case "Elhaghiye":
                if(     log.getArtifactState().equals("TAGHIR_NAHAYI_SHODE") ||
                        log.getArtifactState().equals("FASKH_NAHAYI_SHODE") ||
                        log.getArtifactState().equals("EBTAL_NAHAYI_SHODE")
                        )
                {
                    Long elhaghiyeId = log.getArtifactId();
                    Elhaghiye elhaghiye = elhaghiyeRepository.findOne(elhaghiyeId);
                    artifact = elhaghiye;
                }
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
