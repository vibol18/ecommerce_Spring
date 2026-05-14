package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Banner;
import com.example.demo.Service.BannerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/banners")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class BannerController {

    private final BannerService bannerService;

    @GetMapping
    public List<Banner> getAllBanners() {
        return bannerService.getAllBanners();
    }

    @PostMapping
    public Banner createBanner(@RequestBody Banner banner) {
        return bannerService.create(banner);
    }

    @PutMapping("/{id}")
    public Banner updateBanner(
            @PathVariable Long id,
            @RequestBody Banner banner) {

        return bannerService.updateBanner(id, banner);
    }

    @DeleteMapping("/{id}")
    public String deleteBanner(@PathVariable Long id) {
        return bannerService.deleteBanner(id);
    }
}