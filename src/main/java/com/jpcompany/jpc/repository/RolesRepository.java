package com.jpcompany.jpc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;

@Repository("roleRepository")
public interface RolesRepository extends JpaRepository<Role,Integer> {

    Role findByRole(String role);
}
