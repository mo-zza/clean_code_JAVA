package policy;

/**
 * 매매일 때 중개수수료를 계산해주는 클래스
 */

public class PurchaseBrokeragePolicy implements BrokeragePolicy{
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;

        if (price < 50_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.6, limitAmount: 250_000L);
        } else if (price < 200_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.5, limitAmount: 800_000L);
        } else if (price < 600_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.4, limitAmount: null);
        } else if (price < 900_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.5, limitAmount: null);
        } else {
            rule = new BrokerageRule(brokeragePercent: 0.9, limitAmount: null);
        }
        return rule;
    }
}
