package ir.parsianinsurance.he.domain.scheduled;

import ir.parsianinsurance.he.domain.service.ISequenceService;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by Mohammad on 7/26/2017.
 */

@Startup
@Singleton
public class VahedhayeSodoorSequenceNewYearJob {

    @Inject
    VahedRepository vahedRepository;

    @Inject
    ISequenceService sequenceService;

    @Schedule(year="2018", month="Mar", dayOfMonth="21")
    public void resetAllSequencesDueToBeginningYear1397() {reset();}

    @Schedule(year="2019", month="Mar", dayOfMonth="21")
    public void resetAllSequencesDueToBeginningYear1398() {reset();}

    @Schedule(year="2020", month="Mar", dayOfMonth ="20")
    public void resetAllSequencesDueToBeginningYear1399() {reset();}

    @Schedule(year="2021", month="Mar", dayOfMonth ="21")
    public void resetAllSequencesDueToBeginningYear1400() {reset();}

    @Schedule(year="2022", month="Mar", dayOfMonth ="21")
    public void resetAllSequencesDueToBeginningYear1401() {reset();}

    @Schedule(year="2023", month="Mar", dayOfMonth ="21")
    public void resetAllSequencesDueToBeginningYear1402() {reset();}

    @Schedule(year="2024", month="Mar", dayOfMonth ="20")
    public void resetAllSequencesDueToBeginningYear1403() {reset();}

    @Schedule(year="2025", month="Mar", dayOfMonth ="20")
    public void resetAllSequencesDueToBeginningYear1404() {reset();}

    @Schedule(year="2026", month="Mar", dayOfMonth ="21")
    public void resetAllSequencesDueToBeginningYear1405() {reset();}

    @Schedule(year="2027", month="Mar", dayOfMonth ="21")
    public void resetAllSequencesDueToBeginningYear1406() {reset();}


    private void reset(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Happy New year :)");
        System.out.println("Reseting All Sequences Due To NewYear...");
        vahedRepository.resetAllNamayandesSequences();
        System.out.println("Done!");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");    }
}
