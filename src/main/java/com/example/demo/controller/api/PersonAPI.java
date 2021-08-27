package com.example.demo.controller.api;

import com.example.demo.model.dto.*;
import com.example.demo.service.PersonService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController // api는 restController 어노테이션을 사용한다. 아래의 메소드들은 자동으로 리폰바 적용됨
@RequestMapping("/personApi")
public class PersonAPI {

    private final PersonService personService;

    @Autowired
    public PersonAPI(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/addEduInfo")
    public UserInfo restfulGet(Model model){

        int personNo = 1;

        Person person = new Person();
        person = personService.selectPersonByPersonNo(personNo);

        List<SchoolList> schoolLists = new ArrayList<>();
        schoolLists = personService.selectSchoolList(personNo);

        Academy academy = personService.selectAcademy(personNo);

        List<Skills> skillsList = personService.selectSkillsList(personNo);

        UserInfo userInfo = new UserInfo();
        userInfo.setPerson(person);
        userInfo.setAcademy(academy);
        userInfo.setSkills(skillsList);
        userInfo.setSchoolListList(schoolLists);

        return userInfo;
    }

    @GetMapping("/lottoNumGenerate")
    public List<String> lottoNumList(){

        List<String> lottoNumList = new ArrayList<>();

        for (int i = 0; i < 6; i++){
                int lottoNum = (int)(Math.random() * 45 + 1);
                String lottoNumToString = String.valueOf(lottoNum);

            if(i < 5){

                lottoNumList.add(lottoNumToString + ", ");
            }else{

                lottoNumList.add(lottoNumToString);
            }
        }
        return lottoNumList;
    }

    @GetMapping("/todayLuck")
    public List<String> todayLuck(){
        List<String> todayLuckList = new ArrayList<>();

        int goldLuck = (int)(Math.random() * 100 + 1);
        int relationLuck = (int)(Math.random() * 100 + 1);

        if(goldLuck > 90){
            todayLuckList.add("금전운 : " + goldLuck + "% 입니다! 오늘은 로또를 사보세요, " + "<br>");
        }else {
            todayLuckList.add("금전운 : " + goldLuck + "% , <br>");
        }

        todayLuckList.add(" 연애운 : " + relationLuck+ "% ");

        return todayLuckList;
    }

    @GetMapping("/myName")
    public String selectMyName(){

        int personNo = 1;
        String myName = personService.selectMyName(personNo);

        return myName;
    }

    @GetMapping("/exportExcel")
    public String exportExcel(){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("new sheet");
        Row row = null;

        int rowNum = 0;
        int colNum = 0;

        row = sheet.createRow(0);
        row.createCell(0).setCellValue("민연준");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/xray21/Desktop/newExcel.xlsx");
            workbook.write(fileOutputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "1";
    }

}
