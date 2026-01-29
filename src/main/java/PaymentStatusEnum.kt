public enum PaymentStatusEnum {
    UNPAID,
    PAID
}
public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
}

public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
}
