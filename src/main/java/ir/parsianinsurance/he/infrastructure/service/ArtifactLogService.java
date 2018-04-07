package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.Artifact;
import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;
import ir.parsianinsurance.he.infrastructure.repository.BimenameRepository;
import ir.parsianinsurance.he.infrastructure.repository.ElhaghiyeRepository;
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
    KhesaratRepository khesaratRepository;

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

            case "Khesarat":
                if(log.getArtifactState().equals("ELAAM_BE_MAALI"))
                {
                    Long khesaratId = log.getArtifactId();
                    Khesarat khesarat = khesaratRepository.findOne(khesaratId);
                    artifact = khesarat;
                }
                break;
        }

        return artifact;
    }
}
