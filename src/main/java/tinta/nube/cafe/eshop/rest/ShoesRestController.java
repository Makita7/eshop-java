package tinta.nube.cafe.eshop.rest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinta.nube.cafe.eshop.dto.ShoeDTO;

@RestController
@RequestMapping("/journals")
@CrossOrigin(origins = "http://localhost:9090")
public interface ShoesRestController {

    ShoeDTO addShoe(ShoeDTO journalItem);
    void deleteShoe(Long id);
    ShoeDTO updateShoe(ShoeDTO journalItem);

}
