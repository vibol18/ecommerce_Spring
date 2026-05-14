package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Banner;
import com.example.demo.Repository.BannerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BannerService {
    private final BannerRepository bannerRepository;

    // GetAll
    public List<Banner> getAllBanners() {
        return bannerRepository.findAll();
    }

    //
    public Banner create(Banner banner) {
        Banner newBanner = new Banner();
        newBanner.setTitle(banner.getTitle());
        newBanner.setImageUrl(banner.getImageUrl());
        return bannerRepository.save(newBanner);
    }

    // update
    public Banner updateBanner(Long id, Banner banner) {
        Banner oldBanner = bannerRepository.findById(id).orElse(null);
        if (oldBanner == null) {
            oldBanner.setTitle(banner.getTitle());

            oldBanner.setImageUrl(banner.getImageUrl());
            return bannerRepository.save(oldBanner);
        }
        return null;
    }

    public String deleteBanner(Long id) {
        bannerRepository.deleteById(id);
        return "Banner with id " + id + " has been deleted.";
    }
}
