package tinta.nube.cafe.eshop.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.dto.response.ShoeResponseDTO;
import tinta.nube.cafe.eshop.service.ShoesService;

import java.util.UUID;

@RestController
@RequestMapping("/shoes")
@CrossOrigin(origins = "http://localhost:9090")
@RequiredArgsConstructor
public class ShoesRestController {

    private final ShoesService shoesService;

    @GetMapping("/{id}")
    public ResponseEntity<ShoeResponseDTO> getShoe(@PathVariable UUID id) {
        ShoeResponseDTO shoeResponseDTO = shoesService.getShoe(id);
        return ResponseEntity.ok(shoeResponseDTO);
    }

    @PostMapping
    public ResponseEntity<ShoeResponseDTO> saveShoe(@RequestBody ShoeRequestDTO newShoe) {
        ShoeResponseDTO shoeResponseDTO = shoesService.addShoe(newShoe);
        return new ResponseEntity<>(shoeResponseDTO, HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<ShoeResponseDTO> updateShoe(@RequestBody ShoeRequestDTO shoeItem) {
        ShoeResponseDTO shoeResponseDTO = shoesService.updateShoe(shoeItem);
        return ResponseEntity.ok(shoeResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShoeById(@PathVariable UUID id) {
        shoesService.deleteShoe(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
