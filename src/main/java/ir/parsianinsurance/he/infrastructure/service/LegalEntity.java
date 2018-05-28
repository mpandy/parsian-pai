package ir.parsianinsurance.he.infrastructure.service;

public class LegalEntity {

    private String name;
    private String address;
    private String codeposti;

    public LegalEntity(String name, String address, String codeposti) {
        this.name = name;
        this.address = address;
        this.codeposti = codeposti;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCodeposti() {
        return codeposti;
    }
}
