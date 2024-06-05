package co.com.choucair.certification.reto.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class TestLoombok {
    private String user;
    private String pass;
    private String name;
    private String lastName;
    private String email;
    private String estado;
    private String record;

    public static List<TestLoombok> setData(DataTable dataTable) {
        List<TestLoombok> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, TestLoombok.class));
        }
        return dates;
    }

}
