package policy;

/**
 * 임대차일 때 중개수수료를 계산해주는 클래스
 */

public class RentBrokerageProlicy implements BrokeragePolicy {
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;

        if (price < 50_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.5, limitAmount: 200_000L);
        } else if (price < 100_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.4, limitAmount: 300_000L);
        } else if (price < 300_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.3, limitAmount: null);
        } else if (price < 600_000_000) {
            rule = new BrokerageRule(brokeragePercent: 0.4, limitAmount: null);
        } else {
            rule = new BrokerageRule(brokeragePercent: 0.8, limitAmount: null);
        }
        return rule;
    }
}