package policy;

import com.zeeeu.houseutils.exception.ErrorCode;
import com.zeeeu.houseutils.exception.HouseUtilsException;
import constants.ActionType;

public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokerageProlicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST,
                        "There is not have any actionType.");
        }
    }

}
