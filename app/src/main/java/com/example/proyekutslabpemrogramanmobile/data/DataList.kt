package com.example.proyekutslabpemrogramanmobile.data

import com.example.proyekutslabpemrogramanmobile.R
import com.example.proyekutslabpemrogramanmobile.model.DataModel
import android.content.Context

class DataList(context: Context) {

    val programmingLanguageList = listOf(
        DataModel(
            logoId = R.drawable.c_logo,
            name = context.getString(R.string.c_name),
            creator = context.getString(R.string.c_creator),
            yearReleased = context.getString(R.string.c_year_released),
            fileExtension = context.getString(R.string.c_file_extension),
            useCases = context.getString(R.string.c_use_cases),
            description = context.getString(R.string.c_description),
            documentationLink = context.getString(R.string.c_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.cpp_logo,
            name = context.getString(R.string.cpp_name),
            creator = context.getString(R.string.cpp_creator),
            yearReleased = context.getString(R.string.cpp_year_released),
            fileExtension = context.getString(R.string.cpp_file_extension),
            useCases = context.getString(R.string.cpp_use_cases),
            description = context.getString(R.string.cpp_description),
            documentationLink = context.getString(R.string.cpp_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.csharp_logo,
            name = context.getString(R.string.csharp_name),
            creator = context.getString(R.string.csharp_creator),
            yearReleased = context.getString(R.string.csharp_year_released),
            fileExtension = context.getString(R.string.csharp_file_extension),
            useCases = context.getString(R.string.csharp_use_cases),
            description = context.getString(R.string.csharp_description),
            documentationLink = context.getString(R.string.csharp_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.java_logo,
            name = context.getString(R.string.java_name),
            creator = context.getString(R.string.java_creator),
            yearReleased = context.getString(R.string.java_year_released),
            fileExtension = context.getString(R.string.java_file_extension),
            useCases = context.getString(R.string.java_use_cases),
            description = context.getString(R.string.java_description),
            documentationLink = context.getString(R.string.java_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.javascript_logo,
            name = context.getString(R.string.javascript_name),
            creator = context.getString(R.string.javascript_creator),
            yearReleased = context.getString(R.string.javascript_year_released),
            fileExtension = context.getString(R.string.javascript_file_extension),
            useCases = context.getString(R.string.javascript_use_cases),
            description = context.getString(R.string.javascript_description),
            documentationLink = context.getString(R.string.javascript_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.kotlin_logo,
            name = context.getString(R.string.kotlin_name),
            creator = context.getString(R.string.kotlin_creator),
            yearReleased = context.getString(R.string.kotlin_year_released),
            fileExtension = context.getString(R.string.kotlin_file_extension),
            useCases = context.getString(R.string.kotlin_use_cases),
            description = context.getString(R.string.kotlin_description),
            documentationLink = context.getString(R.string.kotlin_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.php_logo,
            name = context.getString(R.string.php_name),
            creator = context.getString(R.string.php_creator),
            yearReleased = context.getString(R.string.php_year_released),
            fileExtension = context.getString(R.string.php_file_extension),
            useCases = context.getString(R.string.php_use_cases),
            description = context.getString(R.string.php_description),
            documentationLink = context.getString(R.string.php_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.python_logo,
            name = context.getString(R.string.python_name),
            creator = context.getString(R.string.python_creator),
            yearReleased = context.getString(R.string.python_year_released),
            fileExtension = context.getString(R.string.python_file_extension),
            useCases = context.getString(R.string.python_use_cases),
            description = context.getString(R.string.python_description),
            documentationLink = context.getString(R.string.python_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.sql_logo,
            name = context.getString(R.string.sql_name),
            creator = context.getString(R.string.sql_creator),
            yearReleased = context.getString(R.string.sql_year_released),
            fileExtension = context.getString(R.string.sql_file_extension),
            useCases = context.getString(R.string.sql_use_cases),
            description = context.getString(R.string.sql_description),
            documentationLink = context.getString(R.string.sql_documentation_link)
        ),
        DataModel(
            logoId = R.drawable.swift_logo,
            name = context.getString(R.string.swift_name),
            creator = context.getString(R.string.swift_creator),
            yearReleased = context.getString(R.string.swift_year_released),
            fileExtension = context.getString(R.string.swift_file_extension),
            useCases = context.getString(R.string.swift_use_cases),
            description = context.getString(R.string.swift_description),
            documentationLink = context.getString(R.string.swift_documentation_link)
        )
    )

}