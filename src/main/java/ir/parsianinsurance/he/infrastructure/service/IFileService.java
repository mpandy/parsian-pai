package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.infrastructure.io.Zamime;

import java.io.IOException;

/**
 * Created by 8119 on 11/11/2017.
 */
public interface IFileService {


    void downloadZamime(Zamime zamime) throws IOException;
}
