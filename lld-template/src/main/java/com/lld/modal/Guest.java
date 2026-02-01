package com.lld.modal;

import com.lld.Dao.SOFDao;
import com.lld.interfaces.Search;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Guest implements Search {
    
    @Override
    public void search(SOFDao dao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
}
