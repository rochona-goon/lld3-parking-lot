package Models;

import Enums.GateType;

public class Gate extends BaseEntity{
    private GateType gateType;
    private Operator operator;

    public Gate(GateType gateType, Operator operator) {
        this.gateType = gateType;
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
