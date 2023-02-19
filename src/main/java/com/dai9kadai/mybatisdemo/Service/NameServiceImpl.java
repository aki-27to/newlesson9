package com.dai9kadai.mybatisdemo.Service;

import com.dai9kadai.mybatisdemo.Mapper.NameMapper;
import com.dai9kadai.mybatisdemo.Model.Name;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }
}
