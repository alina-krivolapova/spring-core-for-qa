package com.acme.banking.dbo.ooad;

import com.acme.banking.dbo.ooad.domain.Account;
import com.acme.banking.dbo.ooad.domain.CheckingAccount;
import org.junit.Test;


public class CheckingAccountTest {
    @Test()
    public void shouldWithdrawWhenAmountIsLesserThanWithdraw() {
        //region Given
        Account sut = new CheckingAccount(0, 5, 4);
        //endregion

        //region When
        sut.withdraw(2);
        //endregion

    }
    @Test()
    public void shouldWithdrawWhenAmountIsLesserThanWithdrawPlusOverdraft() {
        //region Given
        Account sut = new CheckingAccount(0, 5, 4);
        //endregion

        //region When
        sut.withdraw(8);
        //endregion

    }
    @Test(expected = IllegalStateException.class)
    public void shouldThroughExceptionWhenAmountIsGreaterThanWithdraw() {
        //region Given
        Account sut = new CheckingAccount(0, 5, 4);
        //endregion

        //region When
        sut.withdraw(10);
        //endregion

    }

}
