package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.HavaleKhesarat;
import ir.parsianinsurance.he.domain.model.Khesarat;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

import javax.servlet.ServletContext;
import java.io.IOException;

/**
 * Created by Mohammad on 7/26/2017.
 */
public interface IPrintService {
    JasperPrint printBimename(Bimename bimename, ServletContext context) throws JRException, IOException;
    void printAghsat(Bimename bimename) throws JRException, IOException;
    JasperPrint printElhaghiye(Elhaghiye elhaghiye, ServletContext context) throws JRException, IOException;
    JasperPrint printParvandekhesarat(Khesarat khesarat, ServletContext context) throws JRException, IOException;
    JasperPrint printHavalekhesarat(HavaleKhesarat havaleKhesarat, ServletContext context) throws JRException, IOException;
}
