package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;

@Controller
public class ReviewController {

    // レビュー登録画面を表示
    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    // レビュー登録画面へ戻る
    @PostMapping("/show-review-form-ret")
    public String registReviewFormRet(
            @ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    // 入力内容をバリデーションして確認画面へ
    @PostMapping("/regist-review")
    public String registReview(
            @Validated @ModelAttribute ReviewRegistForm form,
            BindingResult result) {

        // バリデーションエラーがある場合
        if (result.hasErrors()) {
            return "regist-review";
        }

        // エラーがなければ確認画面へ
        return "confirm-regist-review";
    }

    // 確認画面から登録完了
    @PostMapping("/confirm-regist-review")
    public String confirmRegistReview(
            @Validated @ModelAttribute ReviewRegistForm form,
            BindingResult result,
            Model model) {

        // バリデーションエラーがある場合
        if (result.hasErrors()) {
            return "regist-review";
        }

        model.addAttribute("msg", "レビュー登録が完了しました。");

        return "complete-regist-review";
    }
}
