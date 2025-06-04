package tinta.nube.cafe.eshop.error;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class EShopCustomException extends RuntimeException {

   private String description;

   private String timestamp;

   private HttpStatus status;

   public EShopCustomException(String message, String description, String timestamp, HttpStatus status) {
      super(message);
      this.description = description;
      this.timestamp = timestamp;
      this.status = status;

   }

}
