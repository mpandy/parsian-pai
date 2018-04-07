package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.infrastructure.io.Zamime;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by 8119 on 11/11/2017.
 */

@RequestScoped
public class FileService implements IFileService {

    @Override
    public void downloadZamime(Zamime zamime) throws IOException {
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();

        ec.responseReset();
        ec.setResponseContentType(zamime.getContentType());
        ec.setResponseContentLength(zamime.getContent().length);
        ec.setResponseHeader("Content-Disposition", "attachment; filename=\"" + zamime.getFileName() + "\"");

        OutputStream output = ec.getResponseOutputStream();
        output.write(zamime.getContent());

        fc.responseComplete();
    }
}
