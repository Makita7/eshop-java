package tinta.nube.cafe.eshop.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tinta.nube.cafe.eshop.dto.ShoeDTO;
import tinta.nube.cafe.eshop.service.ShoesService;

import java.util.List;

@RestController
@RequestMapping("/shoes")
@CrossOrigin(origins = "http://localhost:9090")
public class ShoesRestController {

    @GetMapping("/{id}")
    public List<ShoeDTO> getShoeItem(@PathVariable Long id){
        return ShoesService.getShoe(id);
    }

    @PostMapping
    public ShoeDTO saveShoe(@RequestBody ShoeDTO newShoe){
        return ShoesService.addShoe(newShow);
    }

    @PatchMapping("/{id}")
    public ShoeDTO updateShoe(@PathVariable Long id, @RequestBody ShoeDTO ShoeItem){
        ShoeItem.setId(id);
        return ShoesService.updateShoe(ShoeItem);
    }

    @DeleteMapping("/{id}")
    public void deleteShoeById(@PathVariable Long id){
        return ShoesService.deleteShoe(id);
    }

}
