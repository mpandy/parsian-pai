package ir.parsianinsurance.he.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "INFRA_CITY")
@NamedQuery(name="findAllCityName",
            query="SELECT g.city_name FROM Geo g")
public class Geo {

  @Id
  private String city_id;
  private String city_name;
  private String city_pid;
  private String city_type;
  private String city_id_for_pid;

  public String getCity_id() {
    return city_id;
  }

  public void setCity_id(String city_id) {
    this.city_id = city_id;
  }

  public String getCity_name() {
    return city_name;
  }

  public void setCity_name(String city_name) {
    this.city_name = city_name;
  }

  public String getCity_pid() {
    return city_pid;
  }

  public void setCity_pid(String city_pid) {
    this.city_pid = city_pid;
  }

  public String getCity_type() {
    return city_type;
  }

  public void setCity_type(String city_type) {
    this.city_type = city_type;
  }

  public String getCity_id_for_pid() {
    return city_id_for_pid;
  }

  public void setCity_id_for_pid(String city_id_for_pid) {
    this.city_id_for_pid = city_id_for_pid;
  }
}
