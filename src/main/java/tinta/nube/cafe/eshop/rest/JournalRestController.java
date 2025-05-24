package tinta.nube.cafe.eshop.rest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinta.nube.cafe.eshop.dto.JournalDTO;

@RestController
@RequestMapping("/journals")
@CrossOrigin(origins = "http://localhost:9090")
public interface JournalRestController {

    JournalDTO addJournal(JournalDTO journalItem);
    void deleteJournal(Long id);
    JournalDTO updateJournal(JournalDTO journalItem);

}
