package com.github.shoppingmall.shopping_mall.repository.Cart;

import com.github.shoppingmall.shopping_mall.web.dto.cart.CartDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    CartItem findByCartCartIdAndItemItemId(Integer cartId, Integer itemId); // 상품이 장바구니에 들어있는지 조회

    // TODO. SQL문 수정!!! (상품이미지 가져와야함...)
//    @Query("SELECT new com.github.shoppingmall.shopping_mall.web.dto.cart.CartDetailDto(ci.cartItemId, i.itemName, i.unitPrice, ci.quantity, pf.delegateThumbNail) " +
//            "FROM CartItem ci " +
//            "JOIN ci.item i " +
//            "JOIN PostFile pf ON pf.item.itemId = i.itemId " +
//            "WHERE ci.cart.cartId = :cartId " +
//            "AND pf.delegateThumbNail = 'Y'")
//    List<CartDetailDto> findCartDetailDtoList(@Param("cartId") Integer cartId);

    void deleteByCartUserUserId(Integer userId);
}
