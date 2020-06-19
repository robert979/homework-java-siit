package com.siit.tema14.jdbc.cars.service;

import com.siit.tema14.jdbc.cars.repository.OderDAOImpl;

public class Main {

        public static void main(String[] args) {
            OderDAOImpl oderDAO = new OderDAOImpl();
            oderDAO.create(80, "OFFICE","BRASOV");
        }
    }

