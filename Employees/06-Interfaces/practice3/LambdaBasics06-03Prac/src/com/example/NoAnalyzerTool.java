package com.example;

public class NoAnalyzerTool {
  
  public void showResult(String[] strList, String searchStr, NoStringAnalyzer analyzer){
    for(String current:strList){
      if (analyzer.analyze(current, searchStr)){
        System.out.println("Match: " + current);
      }
    }
  }
}
