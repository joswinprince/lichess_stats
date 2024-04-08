package com.jos.playwright;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

public class Execute {
    public static void main(String[] args) {
        try {
            // Launch a new browser instance
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            // Create a new browser page
            Page page = browser.newPage();

            // Navigate to the URL
            page.navigate("https://lichess.org/@/joswinprince");
           
            System.out.println(page.title());

            // Wait for the page to load
            page.waitForLoadState(LoadState.NETWORKIDLE);
            
            String rank = page.locator("//span[@class='rank']").innerText();
            
            String blitzRanking =  page.locator("//h3[text()='Blitz']/following-sibling::rating/strong").innerText();
            page.waitForTimeout(3500);
            System.out.println(rank);
            System.out.println("(Blitz) Rating:"+blitzRanking);
            // Close the browser
            browser.close();

            // Close Playwright
            playwright.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
