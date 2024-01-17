package com.example.gameoftruthseq.service.impl;
import com.example.gameoftruthseq.dao.UserRepository;
import com.example.gameoftruthseq.exception.EntityNotFoundException;
import com.example.gameoftruthseq.entity.User;
import com.example.gameoftruthseq.service.UserService;
import com.example.gameoftruthseq.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat
                        .format("Игрок с таким ID: {0} не найден", id)));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User existedUser = findById(user.getId());

        BeanUtils.CopyNoNullProperties(user, existedUser);

        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {

        userRepository.deleteById(id);

    }
}
