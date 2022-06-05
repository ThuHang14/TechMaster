package vn.techmaster.jobhunt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Skill {
    Java("Java"),
    CSharp("Csharp"),
    AWS("AWS"),
    SQL("SQL");
  
    public final String label;
}
