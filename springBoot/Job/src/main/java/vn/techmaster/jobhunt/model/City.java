package vn.techmaster.jobhunt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum City {
  AllCity("All cities"),
  DaNang("Da Nang"),
  HaNoi("Ha Noi"),
  HaiPhong("Hai Phong"),
  HoChiMinh("Ho Chi Minh"),
  Others("Others");

  public final String label;
}
