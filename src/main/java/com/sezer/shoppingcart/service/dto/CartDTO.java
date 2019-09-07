package com.sezer.shoppingcart.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.sezer.shoppingcart.domain.Cart} entity.
 */
public class CartDTO implements Serializable {

    private Long id;

    private Integer quantity;


    private Long cartStateId;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getCartStateId() {
        return cartStateId;
    }

    public void setCartStateId(Long cartStateId) {
        this.cartStateId = cartStateId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CartDTO cartDTO = (CartDTO) o;
        if (cartDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), cartDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CartDTO{" +
            "id=" + getId() +
            ", quantity=" + getQuantity() +
            ", cartState=" + getCartStateId() +
            ", user=" + getUserId() +
            "}";
    }
}
