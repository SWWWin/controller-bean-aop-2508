package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@RequiredArgsConstructor
@Service
@Validated // 프록시 모드 작동
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public long count() {
        return personRepository.count();
    }
}
