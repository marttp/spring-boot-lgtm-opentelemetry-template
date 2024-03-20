package dev.tpcoder.coupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CouponService {

    private final Logger logger;

    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.logger = LoggerFactory.getLogger(CouponService.class);
        this.couponRepository = couponRepository;
    }

    public Iterable<Coupon> findAll() {
        logger.debug("Fetching all coupons");
        var coupons = couponRepository.findAll();
        logger.debug("Coupons: {}", coupons);
        return coupons;
    }

    public Coupon findById(Long id) {
        logger.debug("Fetching coupon by id: {}", id);
        return couponRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Invalid id: %d".formatted(id)));
    }

    public Coupon saveCoupon(Coupon coupon) {
        logger.debug("Saving coupon: {}", coupon);
        var newlyCoupon = couponRepository.save(coupon);
        logger.debug("New coupon on store: {}", newlyCoupon);
        return newlyCoupon;
    }

    public void deleteCoupon(Long id) {
        logger.debug("Deleting coupon by id: {}", id);
        var coupon = couponRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Invalid id: %d".formatted(id)));
        couponRepository.delete(coupon);
        logger.debug("Deleted coupon by id: {}", id);
    }

    public List<Coupon> findActiveCoupons(LocalDateTime startDate, LocalDateTime endDate) {
        logger.debug("Fetching active coupons between {} and {}", startDate, endDate);
        var activeCoupons = couponRepository.findActiveCoupons(startDate, endDate);
        logger.debug("Active coupons: {}", activeCoupons);
        return activeCoupons;
    }
}