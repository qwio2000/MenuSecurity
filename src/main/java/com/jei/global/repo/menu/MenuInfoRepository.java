package com.jei.global.repo.menu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jei.global.domain.menu.MenuInfo;

public interface MenuInfoRepository extends JpaRepository<MenuInfo, String> {
	
	public List<MenuInfo> findByMenuUrl(String url);

}
