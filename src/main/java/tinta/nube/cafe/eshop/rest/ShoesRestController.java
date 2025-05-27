package tinta.nube.cafe.eshop.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.service.ShoeServiceImpl;
import tinta.nube.cafe.eshop.service.ShoesService;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/shoes")
@CrossOrigin(origins = "http://localhost:9090")
@RequiredArgsConstructor
public class ShoesRestController {
private final ShoesService shoesService;

    @GetMapping("/{id}")
    public ShoeRequestDTO getShoe(@PathVariable UUID id){
        return shoesService.getShoe(id);
    }

    @PostMapping
    public ShoeRequestDTO saveShoe(@RequestBody ShoeRequestDTO newShoe){
        return shoesService.addShoe(newShoe);
    }

    @PatchMapping
    public ShoeRequestDTO updateShoe(@RequestBody ShoeRequestDTO shoeItem){
        return shoesService.updateShoe(shoeItem);
    }

    @DeleteMapping("/{id}")
    public void deleteShoeById(@PathVariable UUID id){
        shoesService.deleteShoe(id);
    }

}
