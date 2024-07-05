package com.sparta.instahub.postlike.controller;

import com.sparta.instahub.auth.service.UserDetailsServiceImpl;
import com.sparta.instahub.postlike.service.PostLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts{postId}")

public class PostLikeController {

    private final PostLikeService postLikeService;

    @PostMapping("/likes")
    public ResponseEntity<CommonResDto<Void>> addPostLike(@PathVariable(name="postId") long postId, @AuthenticationPrincipal UserDetailsServiceImpl userDetailsService)



}
