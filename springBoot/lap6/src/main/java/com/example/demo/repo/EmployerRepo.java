package com.example.demo.repo;

import com.example.demo.model.Employer;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class EmployerRepo {
    private ConcurrentHashMap<String, Employer> employers = new ConcurrentHashMap<>();
    public EmployerRepo(){

    }
    public Employer add(Employer employer){
        String id = UUID.randomUUID().toString();
        employer.setId(id);
        employers.put(id,employer);
        return employer;
    }
    public Collection<Employer> getAll(){
        return employers.values();
    }

    public Employer findById(String id){
        return employers.get(id);
    }

    @PostConstruct
    public void addSomeData(){
        this.add( Employer.builder()
                .name("FPT")
                .website("http/ft.com")
                .logo_path("htt")
                .email("fpt@gmail.com").build());
        this.add( Employer.builder()
                .name("CMC")
                .website("http/cmc.com")
                .logo_path("htt")
                .email("cmct@gmail.com").build());
        this.add( Employer.builder()
                .name("gg")
                .website("http/gg.com")
                .logo_path("htt")
                .email("gg@gmail.com").build());
    }
}
