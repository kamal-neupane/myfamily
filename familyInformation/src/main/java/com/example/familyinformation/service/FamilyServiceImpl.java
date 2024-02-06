package com.example.familyinformation.service;

import com.example.familyinformation.dao.FamilyRepository;
import com.example.familyinformation.entity.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyServiceImpl implements FamilyService{
    private FamilyRepository familyRepository;

    @Autowired
    public FamilyServiceImpl(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    @Override
    public List<FamilyMember> getAllFamily() {
        return familyRepository.findAll();
    }

    @Override
    public FamilyMember getFamilyMemberById(int id) {
        Optional<FamilyMember> optionalFamilyMember = familyRepository.findById(id);
        FamilyMember familyMember = null;
        if(optionalFamilyMember.isPresent()){
            familyMember = optionalFamilyMember.get();
        }else {
            throw  new RuntimeException("Family not found with id: " + id);
        }

       return familyMember;
    }

    @Override
    public FamilyMember save(FamilyMember familyMember) {
        return familyRepository.save(familyMember);
    }



    @Override
    public void delete(int id) {
        familyRepository.deleteById(id);

    }
}
