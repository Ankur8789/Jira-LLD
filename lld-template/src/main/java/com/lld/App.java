package com.lld;
import com.lld.*;
import java.util.*;

import com.lld.Dao.SOFDao;
import com.lld.modal.Account;
import com.lld.modal.Guest;
import com.lld.modal.Member;
import com.lld.modal.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SOFDao sfdao = SOFDao.builder().build();
        Guest guest = Guest.builder().build();

        Account ac = Account.builder()
                            .email("ankur@gmail.com")
                            .id(UUID.randomUUID())
                            .name("Ankur")
                            .build();
        Member member = Member.builder()
                              .account(ac)
                              .build();
         
                              
    }
}
