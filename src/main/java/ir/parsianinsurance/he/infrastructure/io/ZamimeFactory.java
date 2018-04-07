package ir.parsianinsurance.he.infrastructure.io;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import org.primefaces.model.UploadedFile;

/**
 * Created by 8119 on 11/9/2017.
 */
public class ZamimeFactory {
    public static Zamime buildZamimeFromFile(UploadedFile file) {

        Zamime zamime = new Zamime();
        zamime.setFileName(file.getFileName());
        zamime.setContent(file.getContents());
        zamime.setContentType(file.getContentType());
        zamime.setTarikhe_upload(DateUtil.getJalaliCurrentDate());

        return zamime;
    }
}
