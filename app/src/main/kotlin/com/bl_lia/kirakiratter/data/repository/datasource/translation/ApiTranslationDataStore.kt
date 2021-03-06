package com.bl_lia.kirakiratter.data.repository.datasource.translation

import com.bl_lia.kirakiratter.domain.value_object.Translation
import io.reactivex.Single

class ApiTranslationDataStore(
        val translationService: GoogleTranslationService
) : TranslationDataStore {

    override fun translate(key: String, sourceLang: String, targetLang: String, query: String): Single<List<Translation>> {
        return translationService.translate(key, sourceLang, targetLang, query)
                .map { response ->
                    response.data.translations
                }
    }
}