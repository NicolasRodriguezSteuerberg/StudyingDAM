# -*- coding: utf-8 -*-
{
    'name': "openacademy",

    'summary': """
        Este es un modulo de odoo que guarda nombres y descripciones de cosas.
        """,

    'description': """
        Este es mi modulo de odoo
    """,

    'author': "NSteuerberg",
    'website': "https://www.nsteuerberg_openacademy.com",

    # Categories can be used to filter modules in modules listing
    # Check https://github.com/odoo/odoo/blob/16.0/odoo/addons/base/data/ir_module_category_data.xml
    # for the full list
    'category': 'Uncategorized',
    'version': '3.1',

    # any module necessary for this one to work correctly
    'depends': ['base'],

    # always loaded
    'data': [
        'security/ir.model.access.csv',
        'views/views.xml',
        'views/templates.xml',
        'data/datos.xml',
        'data/datosPuntos.xml'
    ],
    # only loaded in demonstration mode
    'demo': [
        'demo/demo.xml',
    ],
}
