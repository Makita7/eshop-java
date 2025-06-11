package tinta.nube.cafe.eshop.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tinta.nube.cafe.eshop.dto.response.CartResponseDTO;
import tinta.nube.cafe.eshop.service.CartService;

import java.util.UUID;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:9090")
@RequiredArgsConstructor
public class CartRestController {

    private final CartService cartService;

    @GetMapping("/{clientId}")
    public ResponseEntity<CartResponseDTO> getCartByClientId(@PathVariable UUID clientId){
        CartResponseDTO cartResponseDTO = cartService.getCartByClientId(clientId);

        return ResponseEntity.ok(cartResponseDTO);
    }

}
