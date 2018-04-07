package ir.parsianinsurance.he.infrastructure.io;

import javax.persistence.*;

/**
 * Created by Mohammad on 11/7/2017.
 */

@Entity
@Table(name = "INFRA_ZAMIME")
public class Zamime {

    @Id
    @GeneratedValue
    private Long id;

    @Lob
    private byte[] content;

    public byte[] getContent() {
        return content;
    }

    private String fileName;
    private String contentType;
    private String tarikhe_upload;

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getTarikhe_upload() {
        return tarikhe_upload;
    }

    public void setTarikhe_upload(String tarikhe_upload) {
        this.tarikhe_upload = tarikhe_upload;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getId() {
        return id;
    }
}
