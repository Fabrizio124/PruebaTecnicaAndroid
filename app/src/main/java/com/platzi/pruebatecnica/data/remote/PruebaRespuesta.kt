package com.platzi.pruebatecnica.data.remote

class PruebaRespuesta

data class AmlCheck(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Any,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class BankIban(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerBirthday(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerEmail(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: String,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerFirstname(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerGender(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Any,
        val newline: Boolean,
        val order: Int,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val values: List<String>,
        val visible: Boolean
)

data class CustomerLastname(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerMonthlyIncome(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerPersoncode(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class CustomerPhone(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: String,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Int,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class Data(
        val aml_check: AmlCheck,
        val bank_iban: BankIban,
        val customer_birthday: CustomerBirthday,
        val customer_email: CustomerEmail,
        val customer_firstname: CustomerFirstname,
        val customer_gender: CustomerGender,
        val customer_lastname: CustomerLastname,
        val customer_monthly_income: CustomerMonthlyIncome,
        val customer_personcode: CustomerPersoncode,
        val customer_phone: CustomerPhone,
        val language: Language,
        val pep_status: PepStatus
)

data class Language(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Any,
        val newline: Boolean,
        val order: Int,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val values: Values,
        val visible: Boolean
)

data class PepStatus(
        val auto_approve: Boolean,
        val cl_visible: Boolean,
        val clientzone_check: Any,
        val clientzone_editable: Boolean,
        val clientzone_required: Boolean,
        val clientzone_visible: Boolean,
        val condition: List<Any>,
        val condition_type: Int,
        val group: String,
        val hidetitle: Boolean,
        val mapper: String,
        val maxlength: Any,
        val newline: Boolean,
        val order: Int,
        val regex: String,
        val req: Boolean,
        val split: Boolean,
        val step: Int,
        val type: String,
        val visible: Boolean
)

data class Values(
        val lv: String,
        val ru: String
)








