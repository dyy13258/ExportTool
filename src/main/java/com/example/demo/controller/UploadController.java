package com.example.demo.controller;

import com.example.demo.server.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class UploadController {
    @Autowired
    UploadService uploadService;
    /**
     * 上传操作
     * @param file
     * @param redirectAttributes
     * @return
     */
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        uploadService.storeFile(file);
        redirectAttributes.addFlashAttribute("message",
                "上传成功 " + file.getOriginalFilename());
        return "redirect:/";
    }
}
