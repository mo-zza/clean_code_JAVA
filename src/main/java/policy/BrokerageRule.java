package policy;

import org.springframework.lang.Nullable;

/**
 * <p>
 * 가격이 특정 범위일 때 상환효율과 상한금액 가지는 클래스
 */
public class BrokerageRule {
    public Double brokeragePercent;

    @Nullable
    public Long limitAmount;

    public Long calcMaxVBrokerage(Long price) {
        if (limitAmount == null) {
            multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price), limitAmount);
    }

    private Long multiplyPercent(Long price) {
        return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
    }
}
