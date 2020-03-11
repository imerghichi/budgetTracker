package com.tracker.demo.Repositories;

import com.tracker.demo.Models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Override
    default List<User> findAll() {
        return null;
    }

    @Override
    default List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    default List<User> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    default <S extends User> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default void flush() {

    }

    @Override
    default <S extends User> S saveAndFlush(S s) {
        return null;
    }

    @Override
    default void deleteInBatch(Iterable<User> iterable) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default User getOne(Integer integer) {
        return null;
    }

    @Override
    default <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends User> S save(S s) {
        return null;
    }

    @Override
    default Optional<User> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(User user) {

    }

    @Override
    default void deleteAll(Iterable<? extends User> iterable) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    @Query(" select u from User u" + " where u.username = ?1") Optional<User> findUserByUsername(String username);
}
